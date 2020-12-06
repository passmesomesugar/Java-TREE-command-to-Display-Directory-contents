# Java Tree command:
This small piece of software can list (or parse txt log) files and directories in folder. 
Folder path should be passed as an argument, i.e. 
Theoretically this could be launched from CLI using: java -cp Main "C:\Users\PC\Desktop\Music".
To avoid hassle: open Pom file in any IDE, pass a path to directory as program arguments in runtime settings.
The results are outputed in same working dir, which gets displayed in console. The contents of output txt log file look something like:
EXAMPLE:
Music
    ├───Dub Reactor Room
    |   |   AlbumArtSmall.jpg
    |   |   Folder.jpg
    |   |   Reactor Core - Deep Techno Mix.mp3
    |   |   Reactor Room - Dub Techno Mix.mp3
    |   |   Reactor Room 0.2 - Dub Techno Mix.mp3
    |   |   Reactor Room 0.3 - Dub Techno Mix.mp3
    |   |   Reactor Room 0.4 - Dub Techno Mix.mp3
    |   |   Reactor Room 0.5 - Dub Techno Mix.mp3
    |   |   Reactor Room 0.6 - Dub Techno Mix.mp3
    |   |   Reactor Room 0.7 - Dub Techno Mix.mp3
    |   |   Reactor Room 0.8 - Dub Techno Mix.mp3
    |   |   Reactor Room 0.9 - Dub Techno Mix.mp3
    |   |   Reactor Room 1.0 - Dub Techno Mix.mp3
    |   |   Reactor Room 1.1 - Dub Techno Mix.mp3
    |   |   Reactor Room 1.2 - Dub Techno Mix.mp3
    |   |   Reactor Room 1.3 - Dub Techno Mix.mp3
    |   |   Reactor Room 1.4 - Dub Techno Mix.mp3
    |   |   Reactor Room 1.5 - Dub Techno Mix.mp3
    |   └───Tracks
    |           Reactor Core - Deep Techno Mix.txt
    |           Reactor Room - Dub Techno Mix.txt
    |           Reactor Room 0.2 - Dub Techno Mix.txt
    |           Reactor Room 0.3 - Dub Techno Mix.txt
    |           Reactor Room 0.4 - Dub Techno Mix.txt
    |           Reactor Room 0.5 - Dub Techno Mix.txt
    |           Reactor Room 0.6 - Dub Techno Mix.txt
    |           Reactor Room 0.7 - Dub Techno Mix.txt
    |           Reactor Room 0.8 - Dub Techno Mix.txt
    |           Reactor Room 0.9 - Dub Techno Mix.txt
    |           Reactor Room 1.0 - Dub Techno Mix.txt
    |           Reactor Room 1.1 - Dub Techno Mix.txt
    |           Reactor Room 1.2 - Dub Techno Mix.txt
    |           Reactor Room 1.3 - Dub Techno Mix.txt
    |           Reactor Room 1.4 - Dub Techno Mix.txt
    |           Reactor Room 1.5 - Dub Techno Mix.txt
    ├───Knight of Cups - Unofficial Soundtrack (2015)
    |       01 - Mark Hannah - Let Tomorrow Burn (Trailer Song).mp3
    |       02 - Jochem Weierink - Farfalla (Trailer Song).mp3
    |       03 - Ralph Vaughan Williams - The Pilgrim's Progress.mp3
    |       04 - Wojciech Kilar - Exodus.mp3
    |       05 - Arsenije Jovanovic - Sogno Di Un Automobile.mp3
    |       06 - Edvard Grieg - The Death Of Ase.mp3
    |       07 - Arvo Part - Symphony No. 4, ''Los Angeles'' - I. Con Sublimita.mp3
    |       08 - Biosphere - Patashnik.mp3
    |       09 - Biosphere - Proem.mp3
    |       10 - Biosphere - As The Sun Kissed The Horizon.mp3
    |       11 - Thee Oh Sees - The Coconut.mp3
    |       12 - Arvo Part - Miserere.mp3
    |       13 - Ralph Vaughan Williams - Fantasy On A Theme Of Thomas Tallis.mp3
    |       14 - Thee Oh Sees - I Need Seed.mp3
    |       15 - Explosions in the Sky - Last Known Surroundings.mp3
    |       16 - Francisco Lupica - Cosmic Beam Experience (Part 1).mp3
    |       17 - Francisco Lupica - Cosmic Beam Experience (Part 2).mp3
    |       18 - Arsenije Jovanovic - Prophecy Of The Village Kremna.mp3
    |       19 - Arsenije Jovanovic - Approaching.mp3
    |       20 - Johann Pachelbel - Canon And Gigue In D Major.mp3
    |       21 - Claude Debussy - Images.mp3
    |       22 - Arcangelo Corelli - Concerto Grosso in G Minor. Op. 6 No. 8, ''Christmas Concerto''.mp3
    |       23 - Frederic Chopin - Nocturne No. 2 in E Flat Major, Op. 9, No. 2.mp3
    |       24 - Bosco Delrey - Cool Out.mp3
    |       25 - Ludwig van Beethoven - Symphony No. 9, ''Choral''- IV. Finale - Presto.mp3
    |       26 - M. Ashraf & Nahid Akhtar - Dilbar Dilbara.mp3
    |       27 - Claude Debussy - Nocturnes - Sirenes.mp3
    |       28 - Arvo Part - Silouans Song.mp3
    |       29 - Max Bruch - Kol Nidrei.mp3
    |       30 - Biosphere - Hyperborea.mp3
    |       31 - Claude Debussy - 6 Epigraphes Antiques - Pour l'egyptienne.mp3
    |       32 - Edvard Grieg - Solveig's Song.mp3
    |       33 - Sleep Good - Schlitterbahn.mp3
    |       34 - White Mystery - Secret Garden.mp3
    |       35 - Henryk Gorecki - Symphony No. 3, Op. 36, ''Symphony Of Sorrowful Songs''.mp3
    |       36 - Burial - Ashtray Wasp.mp3
    |       37 - David Parsons - Dawa Gompa.mp3
    |       38 - Biosphere - The Things I Tell You.mp3
    |       39 - Klaus Wiese - Ceremony 1.mp3
    |       40 - Klaus Wiese - Ceremony 3.mp3
    |       41 - Paul Horn - Initiation Psalm 1.mp3
    |       42 - Tibor Szemzo - Snapshot From The Island.mp3
    |       cover.jpg
    └───Thom Brennan
        ├───Thom Brennan - 2005 - Silver (FLAC)
        |       01 – Silver Part 1.flac
        |       02 – Silver Part 2.flac
        |       03 – Silver Part 3.flac
        |       04 – Silver Part 4.flac
        |       05 – Silver Part 5.flac
        |       06 – Silver Part 6.flac
        |       07 – Time.flac
        |       08 – Afterglow.flac
        |       Image1.jpg
        |       Image2.jpg
        |       Image3.jpg
        |       Silver.cue
        |       Thom Brennan - Silver.log
        |       Thom Brennan - Silver.m3u
        └───Thom Brennan - Mountains (2005)
                01 - Thom Brennan - Green River Passage.flac
                02 - Thom Brennan - Incense and Rain.flac
                03 - Thom Brennan - The Burning Temple.flac
                04 - Thom Brennan - Habu Valley.flac
                05 - Thom Brennan - Mountains.flac
                06 - Thom Brennan - Tiger River.flac
                07 - Thom Brennan - Monsoon.flac
                Thom Brennan - Mountains.cue
                Thom Brennan - Mountains.log
  

