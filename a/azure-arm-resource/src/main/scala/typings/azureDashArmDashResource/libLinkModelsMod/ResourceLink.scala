package typings.azureDashArmDashResource.libLinkModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceLink
  extends typings.msDashRestDashAzure.msDashRestDashAzureMod.BaseResource {
  /**
    * The fully qualified ID of the resource link.
    */
  val id: js.UndefOr[String] = js.native
  /**
    * The name of the resource link.
    */
  val name: js.UndefOr[String] = js.native
  /**
    * Properties for resource link.
    */
  var properties: js.UndefOr[ResourceLinkProperties] = js.native
  /**
    * The resource link object.
    */
  val `type`: js.UndefOr[js.Any] = js.native
}

