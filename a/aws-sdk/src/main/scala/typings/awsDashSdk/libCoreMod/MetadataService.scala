package typings.awsDashSdk.libCoreMod

import typings.awsDashSdk.libMetadataUnderscoreServiceMod.MetadataServiceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/core", "MetadataService")
@js.native
/**
  * Creates a new MetadataService object with a given set of options.
  */
class MetadataService ()
  extends typings.awsDashSdk.libMetadataUnderscoreServiceMod.MetadataService {
  def this(options: MetadataServiceOptions) = this()
}

/* static members */
@JSImport("aws-sdk/lib/core", "MetadataService")
@js.native
object MetadataService extends js.Object {
  /**
    * 169.254.169.254
    */
  var host: String = js.native
}

