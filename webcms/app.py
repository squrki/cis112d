import filemanager as filemanager
import cms
import cmsserver as cmsserver
import threading

# 5. Class and Module Construction(5 Points)
# You will employ classes and modules to construct the various elements
# of your application.


def main():
    app = cms.cms()

    server_thread = threading.Thread(
        target=cmsserver.runServer, args=(cmsserver,))
    server_thread.daemon = True
    server_thread.start()

    app.mainloop()


if __name__ == "__main__":
    main()
