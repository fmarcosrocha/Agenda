package reuniao

import agenda.Contato

class Reuniao {
    String assunto
    String ata
    Date data
    
    
    static hasMany = [contatos:Contato]
     def contato = new Contato()
    
    static constraints = {
        
        assunto (nunable:true , blank:true)
        ata (nunable:true , balnk:true)
    }
}
