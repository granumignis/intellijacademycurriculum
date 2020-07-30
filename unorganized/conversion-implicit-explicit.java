    long lo = Integer.MAX_VALUE; // Implicit
    int i = lo; // Explicit Casting Required
    char ch = (int) 2; // Implicit (Why?)
    char ch2 = i; // Explicit casting required (Why?)

    double d = ch2; // char can go 'up the stream' as if it were an int

    float f = d;


    // Rule of thumb. If casting to a value and not a var, the rules apply
    // if it's a var? *shrug*
