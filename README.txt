TDD-getriebene Entwicklung einer FizzBuzz-Anwendung

- Zunächt wurde die Enwicklung der FizzBuzz-Logik angegangen. Hierzu wurden einige Tests erstellt (FizzbuzzCalculatorTest.java).
	Daraufhin wurde die Berechnung der Logik inkrementell aufgebaut und später optimiert (FizzbuzzCalculator.java).

- Anschließend wurde der Controller, welcher die Webanfragen bearbeitet (FizzbuzzController), sowie eine Testklasse (FizzbuzzControllerTest) für diesen erstellt.
	Auch hier wurde der Controller nach den Vorgaben der Tests aufgebaut und später optimiert.

Der Controller bearbeitet nur HTTP-GET Anfragen mit der FizzBuzz-Methode. Die zu verwendende Zahl ist im im URL-Pfad bereitzustellen (localhost:8080/{fizzbuzz-zahl}).
Anfragen wurden mit Postman getestet.