package typings.ionic

import typings.atIonicCliDashFramework.definitionsMod.CommandLineOptions
import typings.ionic.libCommandMod.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/commands/deploy/core", JSImport.Namespace)
@js.native
object commandsDeployCoreMod extends js.Object {
  @js.native
  abstract class DeployConfCommand () extends DeployCoreCommand {
    val optionsToPlistKeys: Anon_Appid = js.native
    val optionsToStringXmlKeys: Anon_Appid = js.native
    /* protected */ def addConfToAndroidString(options: CommandLineOptions): js.Promise[Boolean] = js.native
    /* protected */ def addConfToIosPlist(options: CommandLineOptions): js.Promise[Boolean] = js.native
    /* protected */ def checkDeployInstalled(): js.Promise[Boolean] = js.native
    /* protected */ def getAndroidCapString(): js.Promise[String] = js.native
    /* protected */ def getAppId(): js.Promise[js.UndefOr[String]] = js.native
    /* protected */ def getIosCapPlist(): js.Promise[String] = js.native
    /* protected */ def preRunCheckInputs(options: CommandLineOptions): js.Promise[Unit] = js.native
    /* protected */ def printPlistInstructions(options: CommandLineOptions): Unit = js.native
    /* protected */ def printStringXmlInstructions(options: CommandLineOptions): Unit = js.native
  }
  
  @js.native
  abstract class DeployCoreCommand () extends Command {
    /* protected */ def getAppIntegration(): js.Promise[js.UndefOr[String]] = js.native
    /* protected */ def requireNativeIntegration(): js.Promise[Unit] = js.native
  }
  
}

