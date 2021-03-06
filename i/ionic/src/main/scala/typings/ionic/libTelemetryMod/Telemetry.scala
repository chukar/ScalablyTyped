package typings.ionic.libTelemetryMod

import typings.ionic.definitionsMod.IClient
import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.ISession
import typings.ionic.definitionsMod.ITelemetry
import typings.ionic.definitionsMod.InfoItem
import typings.ionic.definitionsMod.IonicContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/telemetry", "Telemetry")
@js.native
class Telemetry protected () extends ITelemetry {
  def this(hasConfigClientGetInfoCtxProjectSession: TelemetryDeps) = this()
  val client: IClient = js.native
  val config: IConfig = js.native
  val ctx: IonicContext = js.native
  val project: js.UndefOr[IProject] = js.native
  val session: ISession = js.native
  /* protected */ def getInfo(): js.Promise[js.Array[InfoItem]] = js.native
  /* CompleteClass */
  override def sendCommand(command: String, args: js.Array[String]): js.Promise[Unit] = js.native
}

