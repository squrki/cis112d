import socket
import pickle

# Implement a server application(`server.py`) that listens for incoming connections from clients.
# Define a dictionary(`people`) containing information about individuals (you can choose what information you want to include. Have fun with it!).
# Each key-value pair represents the name and associated information of an individual.
people = {
    "Cassian Andor": "Rebel Spy",
    "Jyn Erso": "Rebel Leader, Daughter of Galen Erso (Project Stardust architect)",
    "K-2SO": "Imperial Droid, reprogrammed by Rebels",
    "Mon Mothma": "Senator - Chandrila, Rebel Leader",
    "Saw Gerrera": "Rebel Extremist",
    "Bodhi Rook": "Rebel Pilot",
    "Luthen Rael": "Rebel Commander",
    "Bix Caleen": "Rebel Operative",
    "Marva Andor": "Rebel Supporter",
    "Kleya Marki": "Rebel Agent",
    "Bail Organa": "Senator - Alderaan, Rebel Founder",
    "Leia Organa": "Princess - Alderaan, Rebel Leader",
}

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server.bind(('localhost', 4242))
server.listen()

# While the server is active it should print status updates to the terminal.
# Specifically the following statuses:
#    - "Listening on [host:port]" when the server starts listening for incoming connections.
print("Listening on localhost:4242")

#    - "Connection established with [client_address]" when a connection is established with a client.
client, caddress = server.accept()
print(f"Connection established with {caddress}")

# Upon receiving a client request, the server should check if the requested name exists in the dictionary:
while True:
    received = client.recv(4096)
    unpickled_name = pickle.loads(received)
    if unpickled_name == "exit":
        print("\nClient has exited the session.")
        break

    print("\nReceived request for:", unpickled_name)

    #    - If the name exists, the server should send the associated information to the client.
    if unpickled_name.title() in people:
        # Utilize the `pickle` module to serialize and deserialize data for communication between the client and server.
        str = f"Name: {unpickled_name.title()}\nSuspected Role: {people[unpickled_name.title()]}"
        response = pickle.dumps(str)
    else:
        #    - If the name does not exist, the server should send a notification to the client that the person does not exist.
        response = pickle.dumps("Person not found in the database.")

    print(f"\nSending response:\n{pickle.loads(response)}")

    client.send(response)

server.close()
