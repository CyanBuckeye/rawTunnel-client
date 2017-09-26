SET(CMAKE_SYSTEM_NAME )
enable_language(ASM)
SET(GCC_COVERAGE_COMPILE_FLAGS "-Wall -Wextra -Wno-unused-variable -Wno-unused-parameter -Wno-missing-field-initializers")
SET(GCC_COVERAGE_LINK_FLAGS    "-lpthread -lrt -static -O3 -m32")
SET( CMAKE_CXX_FLAGS  "${CMAKE_CXX_FLAGS} ${GCC_COVERAGE_COMPILE_FLAGS}" )
SET( CMAKE_EXE_LINKER_FLAGS  "${CMAKE_EXE_LINKER_FLAGS} ${GCC_COVERAGE_LINK_FLAGS}" )
#add_subdirectory(aes_acc)
add_library(
    ENCRYPT_LIB
    SHARED
    aes.c
    md5.c
    #sha1.c
)   
#target_link_libraries(
#    ENCRYPT_LIB
#    ACC_LIB
#)
