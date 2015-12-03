import com.urbancode.air.AirPluginTool
import com.urbancode.air.XTrustProvider

final def airTool = new AirPluginTool(args[0], args[1])
final def props = airTool.getStepProperties()
XTrustProvider.install()

// Setup properties for plugin
def exitStatus = 0

// Pull in properties from plugin
println "Getting properties"
props.each { println it }

def step1_property_name = props['step1_property_name'].trim()
def password = props['token']?props['token']:props['password']

// do something very important here!

// process result and determine if we failed or not
if( true )
{
  exitStatus = 0
}else{
  exitStatus = 1
}


System.exit(exitStatus)
