# Implement a server application(`server.py`) that listens for incoming connections from clients.
# Define a dictionary(`people`) containing information about individuals(you can choose what information you want to include. Have fun with it!). Each key-value pair represents the name and associated information of an individual.
# While the server is active it should print status updates to the terminal. Specifically the following statuses:
#    - "Listening on [host:port]" when the server starts listening for incoming connections.
#    - "Connection established with [client_address]" when a connection is established with a client.
# Upon receiving a client request, the server should check if the requested name exists in the dictionary:
#    - If the name exists, the server should send the associated information to the client.
#    - If the name does not exist, the server should send a notification to the client that the person does not exist.
# Utilize the `pickle` module to serialize and deserialize data for communication between the client and server.
