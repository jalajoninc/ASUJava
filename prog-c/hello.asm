section .data
    msg db "Hello, world!", 0xA
    len equ $ - msg

section .text
    global _main

_main:
    mov     rax, 0x2000004     ; write
    mov     rdi, 1
    lea     rsi, [rel msg]
    mov     rdx, len
    syscall

    mov     rax, 0x2000001     ; exit
    xor     rdi, rdi
    syscall
