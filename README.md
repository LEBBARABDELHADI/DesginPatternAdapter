# DesginPatternAdapter


Voici les principaux éléments du design pattern Adapter :

Target (Cible) : C'est l'interface commune attendue par le client. Le client utilise cette interface pour interagir avec les objets du système.

Adapter : C'est la classe qui implémente l'interface Target. Elle sert d'intermédiaire entre le client et l'objet à adapter. L'adaptateur reçoit les appels de méthode de la part du client
 et les traduit en appels appropriés à l'objet à adapter.

Adaptee (Objet à adapter) : C'est l'objet existant avec une interface incompatible avec la cible.
 L'adaptateur encapsule cet objet et lui permet de collaborer avec le client en utilisant l'interface Target.



Le pattern Adapter permet ainsi de rendre compatibles des classes avec des interfaces incompatibles, en fournissant une classe intermédiaire qui assure la traduction des appels de méthode. Cela permet de réutiliser des classes existantes dans un nouveau contexte sans avoir à les modifier directement.
