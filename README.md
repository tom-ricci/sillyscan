# sillyscan
Sillyscan is a simple Minecraft server scanning tool *for the server*. It encourages scanners to join the server and logs when they do! It runs on a Velocity proxy, not a normal server.

## todo
It's not done, I JUST started this tonight and I gotta go to sleep soon. Currently, all it does is spoof the version returned by the SLP request to encourage matscan to join the server (matscan won't join normally if it notices the server is running Velocity). But, I would like to:
1. Add logging when people join
2. Fingerprint certain bots (currently, just matscan and ServerSeeker because I don't know anyone else with a minecraft server scanning bot)
3. idk, track plugin stats? i like data :3

## building
The project is a Gradle project on JDK 17. It's built like any other Velocity plugin. There is also a Run Configuration stored with the project for IDEA; if you're using IntelliJ you can just run that to build it. 