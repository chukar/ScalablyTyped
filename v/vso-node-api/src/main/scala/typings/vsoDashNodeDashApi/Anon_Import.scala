package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Import extends js.Object {
  var `import`: Double
  var validate: Double
}

object Anon_Import {
  @scala.inline
  def apply(`import`: Double, validate: Double): Anon_Import = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
    __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Import]
  }
}

