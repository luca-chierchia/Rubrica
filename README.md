# Gestore di Rubrica

## Descrizione

Il **Gestore di Rubrica** è un'applicazione scritta in Java che consente di gestire contatti personali. L'applicazione permette di aggiungere, rimuovere, modificare e cercare contatti. I contatti sono memorizzati in una lista (`ArrayList`), e il programma offre anche la possibilità di visualizzare tutti i contatti presenti nella rubrica.

## Funzionalità principali
- **Aggiungere contatti**: Inserisci un nuovo contatto con nome, cognome, numero di telefono ed email.
- **Rimuovere contatti**: Rimuovi un contatto dalla rubrica specificando il contatto esistente.
- **Modificare contatti**: Aggiorna i dettagli di un contatto esistente.
- **Cercare contatti**: Cerca un contatto all'interno della rubrica per verificarne l'esistenza.
- **Visualizzare contatti**: Mostra tutti i contatti attualmente presenti nella rubrica.

## Struttura del progetto

Il progetto è suddiviso in diversi pacchetti per mantenere un'organizzazione modulare e chiara:

- `modelli`: Contiene la classe `Contatto`, che rappresenta un singolo contatto.
- `servizi`: Contiene la classe `Rubrica`, che gestisce l'elenco dei contatti e le operazioni associate.
- `rubricaException`: Contiene la classe `RubricaException`, una classe di eccezione personalizzata per gestire gli errori nel programma (ad esempio, contatti duplicati o inesistenti).
- `main`: Contiene la classe `Main`, che rappresenta il punto di ingresso dell'applicazione.

## Requisiti

- **Java 8** o superiore.
- Un IDE Java come **IntelliJ IDEA** o **Eclipse** per eseguire il codice localmente.
- **Git** (opzionale) per clonare il repository.

## Installazione e Configurazione

1. Clona il repository GitHub:
    ```bash
    git clone https://github.com/tuo-nome-utente/gestore-di-rubrica.git
    ```
   
2. Apri il progetto con il tuo IDE Java preferito (come IntelliJ o Eclipse).

3. Esegui il file `Main.java` che si trova nel pacchetto `main`.

## Esempi di utilizzo

### Aggiungere un contatto:

```java
Contatto c = new Contatto("Matteo", "Rossi", "3225367632", "matteo.rossi12@libero.it");
rubrica.aggiungiContatto(c);
