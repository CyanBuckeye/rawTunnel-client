Android Client for Wangyu's raw tunnel (project link: https://github.com/wangyu-/udp2raw-tunnel).
Wrapped Wangyu's C++ code in Android NDK and made some modifications to cope with low level differences between Linux and Android.

Finished work:
1. Replaced Pthread_kill with my_handler and Pthread_exit
2. Implemented Popen and Pclose
3. Implemented simple UI

(unfinished yet)

