package typings.atPulumiAws.gameliftBuildMod

import typings.atPulumiAws.typesInputMod.gamelift.BuildStorageLocation
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildState extends js.Object {
  /**
    * Name of the build
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Operating system that the game server binaries are built to run on. e.g. `WINDOWS_2012` or `AMAZON_LINUX`.
    */
  val operatingSystem: js.UndefOr[Input[String]] = js.native
  /**
    * Information indicating where your game build files are stored. See below.
    */
  val storageLocation: js.UndefOr[Input[BuildStorageLocation]] = js.native
  /**
    * Version that is associated with this build.
    */
  val version: js.UndefOr[Input[String]] = js.native
}

object BuildState {
  @scala.inline
  def apply(
    name: Input[String] = null,
    operatingSystem: Input[String] = null,
    storageLocation: Input[BuildStorageLocation] = null,
    version: Input[String] = null
  ): BuildState = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (operatingSystem != null) __obj.updateDynamic("operatingSystem")(operatingSystem.asInstanceOf[js.Any])
    if (storageLocation != null) __obj.updateDynamic("storageLocation")(storageLocation.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildState]
  }
}

