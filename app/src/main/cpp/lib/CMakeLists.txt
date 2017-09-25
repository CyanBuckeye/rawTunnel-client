SET(CMAKE_SYSTEM_NAME )
enable_language(ASM)
add_subdirectory(aes_acc)
add_library(
    ENCRYPT_LIB
    SHARED
    aes.c
    aes.h
    md5.c
    md5.h
    sha1.c
)   
target_link_libraries(
    ENCRYPT_LIB
    ACC_LIB
)
