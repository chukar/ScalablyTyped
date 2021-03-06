package typings.atIonicAngular.distDirectivesProxiesMod

import typings.atAngularCore.atAngularCoreMod.ChangeDetectorRef
import typings.atAngularCore.atAngularCoreMod.ElementRef
import typings.atAngularCore.atAngularCoreMod.EventEmitter
import typings.atAngularCore.atAngularCoreMod.NgZone
import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonReorderGroup")
@js.native
class IonReorderGroup protected ()
  extends typings.atIonicCore.distTypesComponentsMod.Components.IonReorderGroup {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  var el: HTMLElement = js.native
  var ionItemReorder: EventEmitter[CustomEvent[_]] = js.native
  var z: NgZone = js.native
}

