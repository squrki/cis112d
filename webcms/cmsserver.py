import http.server
import socketserver

# 4. Server File Hosting(20 Points)
# You should independently run a webserver that will send the webpage
# file to any client that requests it.
# Users should be able to navigate to the host location via a browser
# and load the webpage on demand.


def runServer(self):

    PORT = 4242
    Handler = http.server.SimpleHTTPRequestHandler

    with socketserver.TCPServer(("", PORT), Handler) as httpd:
        print("serving at port", PORT)
        httpd.serve_forever()
