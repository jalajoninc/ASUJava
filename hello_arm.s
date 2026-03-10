    .section __TEXT,__text
    .globl  _main
_main:
    // Call puts("Hello, world!")
    adrp    x0, msg@PAGE
    add     x0, x0, msg@PAGEOFF
    bl      _puts

    // Return 0 (exit status)
    mov     w0, #0
    ret

    .section __TEXT,__cstring
msg:
    .asciz "Hello, world!"
