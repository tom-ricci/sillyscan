# sillyscan
Sillyscan is a simple Minecraft server scanner scanner! It encourages server scanners to join the server and scans them when they do! Note that it runs on a Velocity proxy&mdash;not a normal server.

## todo
Currently, all it does is spoof the version returned by the SLP response to encourage matscan to join the server (matscan won't join normally if it notices the server is running Velocity). But, I would like to:
1. Add logging
2. Fingerprint well-known bots
3. Support BungeeCord and Spigot (including Spigot forks), not just Velocity
4. idk, visualize bot stats? i like data :3

## building
The project is a Gradle project on JDK 17. It's built like any other Velocity plugin. There is also a Run Configuration stored with the project for IDEA; if you're using IntelliJ you can just run that to build it. 