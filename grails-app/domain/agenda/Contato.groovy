package agenda

class Contato {
    
    String nome
    String fone
    String email

    static constraints = {
        
        nome maxSize:50
        fone maxSize:20
        email email:true
    }
}
