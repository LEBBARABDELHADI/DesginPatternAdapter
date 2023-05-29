

// Adaptee
// C'est l'objet existant avec une interface incompatible avec la cible. L'adaptateur
//encapsule cet objet et lui permet de collaborer avec le client en utilisant l'interface Target.
public class CircleAdaptee {

	public void calculArea() {
		System.out.println("calculer area");
	};
}