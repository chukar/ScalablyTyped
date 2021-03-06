package typings.getos.getosMod

import typings.getos.getosStrings.aix
import typings.getos.getosStrings.android
import typings.getos.getosStrings.cygwin
import typings.getos.getosStrings.darwin
import typings.getos.getosStrings.freebsd
import typings.getos.getosStrings.linux
import typings.getos.getosStrings.openbsd
import typings.getos.getosStrings.sunos
import typings.getos.getosStrings.win32
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.getos.getosMod.OtherOs
  - typings.getos.getosMod.LinuxOs
*/
trait Os extends js.Object

object Os {
  @scala.inline
  def OtherOs(os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin): Os = {
    val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Os]
  }
  @scala.inline
  def LinuxOs(dist: String, os: linux, release: String, codename: String = null): Os = {
    val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
    if (codename != null) __obj.updateDynamic("codename")(codename.asInstanceOf[js.Any])
    __obj.asInstanceOf[Os]
  }
}

