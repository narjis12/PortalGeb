def gebEnv = System.getProperty("geb.env")
if (gebEnv) {
    switch(gebEnv) {
        case 'local':
            runner { include Local }
            break
        case 'pre-prod':
            runner { include PreProd }
            break
    }
}