package typings.strophejsDashPluginDashRoster.strophejsDashPluginDashRosterMod.stropheMod.Strophe

import typings.strophejsDashPluginDashRoster.strophejsDashPluginDashRosterMod.StropheRosterPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  var roster: StropheRosterPlugin
}

object Connection {
  @scala.inline
  def apply(roster: StropheRosterPlugin): Connection = {
    val __obj = js.Dynamic.literal(roster = roster.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Connection]
  }
}

