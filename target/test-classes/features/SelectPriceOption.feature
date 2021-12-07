#language: pt


Funcionalidade: Select Price Option

Esquema do Cenário: Selecionar Price Option
    Dado que acesso o site tricentis
    Quando quando estou na aba "Enter Vehicle Data"
    Então preencho o formulário de Vehicle Data
    Quando clico em next para Insurant Data
    Então vejo que estou na aba "Enter Insurant Data"
    Quando preencho o formulário de Insurant Data
    Então clico em next para Product Data
    Quando vejo que estou na aba "Enter Product Data"
    Então preencho o formulário de Product Data
    Quando clico em next para Select Price Option
    Então vejo que estou na aba "Select Price Option"
    Quando Seleciono o Price option <option>
    Então clico em next para Send Quote
    Quando vejo que estou na aba "Send Quote"
    Exemplos:
        |option    |
        |"Silver"  |
        |"Gold"    |
        |"Platinum"|
        |"Ultimate"|