package typings.awsDashRegions.awsDashRegionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.awsDashRegions.awsDashRegionsMod.LookupOptionsCode
  - typings.awsDashRegions.awsDashRegionsMod.LookupOptionsName
*/
trait LookupOptions extends js.Object

object LookupOptions {
  @scala.inline
  def LookupOptionsCode(code: String): LookupOptions = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LookupOptions]
  }
  @scala.inline
  def LookupOptionsName(name: String): LookupOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LookupOptions]
  }
}

