   **La deference entre interface et abstraite**
   
    les classes abstraites et les interface sont similaires:
    1. On peut pas les instancier les deux 
    2. Les deux peuvent avoir un mélange de methode avec corps et sans corps
 
   **Les classes abstraites**
        
       - On parle principalement des classes abstraites lorsque on veux partager un code entre plusieurs classes étroitement liees
       - Quand on attends a ce que les classes qui herite de la classe abstraite aient des methodes et des chaamps en commun ou des modificateur d'acces autres que public
       - Si on veux declarer des champs non static ou non final, cela nous permet de crrer des methodes pour acceder et modifier l'objet(getName)
       - Quand on a une obligation de definir les bases d'implementation de certain methodes dans la classe mère, mais aussi permettez la surcharge des methodes dans les sous classes
       - l'essentiel d'une classe abstraite est de faire une declaration commune de la classe de base pour que les sous classes puissent le partager
       
       1. On peux declarer les champs final et non static
       2. Déclarer les methodes en private, public or protected
       3. extends juste une classe mais plusieurs interfaces
       4. les sous classes des classes abstraites souvent implemente toutes les methodes de la classe mère
       5. Si la sous classe n'implemente pas une des methode elle doit etre déclaré abstraite a son tour
   
   
   **Les Interfaces**
        
       -On attends que les classes non relier implement l'interface.
       -ON veux spécifier le comportement d'une donnéer, mais nous sommes pas conserné par celui qui implemente le comprotement
       -Quend on veut également séparé plusieurs comportemnt
       
        1- declaration d'une methode d'une classe, mais pas l'implementation 
        2- l'implementation se fait dans les classes qui implemente cette interface obligatoirement
        3- l'interface forme une compression entre la classe elle meme et le monde exterieur
        4- On peux pas l'instancier et elle doit contenir des methode sans et avec implementation
        5- Toutes les classes sont definie public et abstract automaticly
        6- il peux herité d'autres interfaces