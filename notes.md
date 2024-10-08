# config system
so, i basically want to just do a bunch of pattern matching, so the plugin doesn't do anything by default, but you have to go into the config and specify a bunch of fingerprints you want to match against bots, and also a bunch of logs you want to match against fingerprints (so you can log specific bots). and, basically, whenever someone pings, the server will try to fingerprint their ping, and then it will match to some fingerprint(s), and then fingerprints are attached to loggers and version spoofers, and then the loggers and version spoofers get triggered and log and spoof the version, according to the most accurate fingerprint. **c**ascading SLP **s**canner configuration**s**! maybe i should add tailwind.


subnet masking syntax for ips to do ip ranges maybe? nah ill just do specifying the ip range my own way like for example "127.0.0.1-127.0.0.20" as a valid range

after gson deserializes the config, im gonna go through all version spoofers and loggers and fingerprints, and basically ill set all the fingerprints up in memory, and then ill add the loggers and version spoofers to them as a field or smth, so i can access the right stuff directly from fingerprints. i think? maybe i wont do that idk.

NO! I KNOW!!! ill add the spoofed version to the fingerprint, so itll have client versions to fingerprint, and then a spoofed version to return.

also, i think i want the fingerprints to directly define the loggers they log to, too. idk. feels like i should consolidate stuff like this instead of what i was doing before. after all, anyone using the plugin would be configuring it centrally. not all over the place.

IM GONNA CHANGE FINGERPRINTS TO BOTS I THINK. LIKE, THE NAME OF THE CONCEPT. BECAUSE NOW THEY DON'T JUST DO FINGERPRINTING TOO, THEY DO OTHER STUFF.

ACTUALLY NO, im gonna have fingerprinting be a subset of bots. each bot object will have some metadata of the bot, and the fingerprint, and version, and stuff.

also, there should be a catch-all bot in the config to take care of all other connections.

ok, so i made this bot config:
```java
public record BotConfig(String name, String description, FingerprintConfig fingerprint, LoggerConfig logging) {}
```

basically, i think i'll have a name and description, OHHH AND AUTHOR! I SHOULD ADD THAT. i think name and desc and author shoul dbe optional., idk tho. maybe not? mauybe some of them should be but not ohters. idk. anyway, so i got THAT, and then uhhh i have the fingerprint config there, and i'll only do one fingerprint per bot, because you can already define multiple ips and ports. and the logger will just be one logger too, and you can specify where to log to and all that stuff. 

the catch all bot should be called the default bot, i think.

hm, actually, im thinking, maybe, instead of the loggers being centralized, they should be their own part of the config, and the fingerprints just specify which loggers to use instead, like i had before. because it would be awfully verbose to define a bunch of loggers for each fingerprint when they all use the same logger. i think ill do that instead.

ok. now i sleep. snrrrk mimimimimi