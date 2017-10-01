Android Client for Wangyu's raw tunnel (project link: https://github.com/wangyu-/udp2raw-tunnel).
Wrapped Wangyu's C++ code in Android NDK and made some modifications to cope with low level differences between Linux and Android.

Finished work:
1. read C++ source code
2. Replaced Pthread_kill with my_handler and Pthread_exit （/app/src/main/cpp/common.cpp From line 365 to 371)
3. Implemented Popen and Pclose (/app/src/main/cpp/common.cpp From line 709 to 784)
4. Implemented simple UI (/app/src/main/res/)
5. Wrote CMake file 
(unfinished yet)

