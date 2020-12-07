# About

This small piece of software can list (or parse txt log) files and directories in folder. 
Folder path should be passed as an argument, i.e. 
theoretically this could be launched from CLI using: java -cp Main "C:\Users\PC\Desktop\Music".
To avoid hassle: open POM.xml file in any IDE, pass a path to directory as program arguments in JVM settings.
The results are outputed in same working dir, which gets displayed in console. The contents of output txt log will look like:

```bash
Music
    ├───Dub Reactor Room
    |   |   AlbumArtSmall.jpg
    |   |   Folder.jpg
    |   |   Reactor Core - Deep Techno Mix.mp3
    |   |   Reactor Room - Dub Techno Mix.mp3
    |   └───Tracks
    |           Reactor Core - Deep Techno Mix.txt
    |           Reactor Room - Dub Techno Mix.txt
    ├───Knight of Cups - Unofficial Soundtrack (2015)
    |       04 - Wojciech Kilar - Exodus.mp3
    |       cover.jpg
    └───Thom Brennan
        ├───Thom Brennan - 2005 - Silver (FLAC)
        |       08 – Afterglow.flac
        |       Image1.jpg
        |       Silver.cue
        |       Thom Brennan - Silver.log
        |       Thom Brennan - Silver.m3u
        └───Thom Brennan - Mountains (2005)
                05 - Thom Brennan - Mountains.flac
                Thom Brennan - Mountains.cue
                Thom Brennan - Mountains.log

```

## License
[MIT](https://choosealicense.com/licenses/mit/)
