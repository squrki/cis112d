import socket
import pickle

# Implement a client application(`client.py`) that connects to the server.

server_address = ('localhost', 4242)
client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client.connect(server_address)

# Upon launching, the client should prompt the user to enter the name of the individual they're interested in.
print("\nImperial Database of Suspected Rebel Sympathizers\n")

while True:
    name = input("Input suspect's name > ")
    pickled_name = pickle.dumps(name)

    # Send the entered name to the server for processing.
    client.send(pickled_name)

    # Receive the response from the server and display it to the user.
    received = client.recv(4096)

    # Utilize the `pickle` module to serialize and deserialize data for communication between the client and server.
    unpickled_data = pickle.loads(received)
    print(f"\nSuspect information:\n{unpickled_data}")

    choice = input(
        "\nDo you wish to look up another suspect? (Y/N) ").strip().lower()
    print("")
    if choice != 'y':
        client.send(pickle.dumps("exit"))
        break

client.close()
