# Component
Project of a written test for the exam of Programming Methodologies.

# Esercizio 1
Si implementi il tipo di dato Component. Un Component può essere :

1) un _**ItemInt**_, che ha come valore (value) un numero intero che lo identifica; il costruttore riceve questo
valore;

2) un _**ItemStrg**_, che ha come valore (value) una stringa che lo identifica; il costruttore riceve questo valore; 

3) oppure un _**Complex**_, che è un insieme di Component; 
   L’oggetto è costruito inizialmente vuoto, poi possono essere aggiunti nuovi Component come componenti.

_Su ogni Component devono essere disponibili i metodi:_
  
  (i) **add**, che aggiunge un Component all’oggetto di invocazione se questo è un Complex, altrimenti lancia un’eccezione;
  
  (ii) **la riscrittura del metodo equals,** che implementa la seguente definizione: 
      - due ItemInt o due ItemStrg sono uguali se hanno valori uguali
      - due Complex sono sempre uguali
      - in tutti gli altri casi il risultato del confronto è false.

Su tutti i Component deve essere possibile definire operazioni esterne (ossia, senza modificare le classi della gerarchia di Component) come **Visitor**.

1. Si definiscano le classi per poter aggiungere queste operazioni esterne.

2. Si implementi, come Visitor concreto, l’operazione **SumInt**, che calcola la somma dei valori interi di tutti gli ItemInt presenti in un Component (includendo, quindi, anche quelli dei Component interni se esso è un Complex); questo Visitor dovrà anche avere un metodo per restituire l’intero-somma così calcolato.


# Esercizio 2 (facoltativo)
Si mostri come viene usato il Visitor concreto definito nell’Esercizio 1.
Supponendo di essere in un’altra classe in cui abbiamo due Component c1 e c2, scrivere le righe di codice con cui possiamo ottenere :

- la stampa della somma dei valori interi di tutti gli ItemInt presenti nel Component c1
- la stampa della somma dei valori interi di tutti gli ItemInt presenti nel Component c2.
