package Model

class Tarefa {
    var id: String? = null
    var titulo: String? = null
    var data: String? = null

    constructor()
    constructor(id: String?, titulo: String?, data: String?) {
        this.id = id
        this.titulo = titulo
        this.data = data
    }
}

