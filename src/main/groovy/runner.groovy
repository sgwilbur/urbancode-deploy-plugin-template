
final def PLUGIN_HOME = System.getenv()['PLUGIN_HOME']
final def script = this.args[0];

File pluginHome = new File(PLUGIN_HOME);
File libDir = new File(pluginHome, "lib");
File scriptFile = new File(script);

libDir.eachFileMatch(~/.*\.jar/) { jar ->
    this.class.classLoader.rootLoader.addURL(jar.toURL());
}

def scriptArgs = [];
scriptArgs << this.args[1];
scriptArgs << this.args[2];
println scriptFile;
run(scriptFile, scriptArgs as String[]);
