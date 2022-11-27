package feedback

import agenda.Contato

class Feedback {
    
    String tema
    String descricao
    
    static hasMany = [contatos:Contato]
     def contato = new Contato()

    static constraints = {
        
        tema (nunable:true , blank:true)
        descricao (nunable:true , blank:true)
             
        
        
        
    }
}
