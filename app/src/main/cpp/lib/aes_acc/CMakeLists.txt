enable_language(ASM)
add_subdirectory(asm)
add_library(
    ACC_LIB
    SHARED
    aesacc.c
    aesarm.c
    aesarm.h
    aesarm_table.h
    aesni.c
    aesni.h)

target_link_libraries(
    ACC_LIB
    ASM_LIB)
