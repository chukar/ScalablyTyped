package typings.mobservable.mobservableMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
import typings.mobservable.libInterfacesMod.IDependencyTree
import typings.mobservable.libInterfacesMod.IObserverTree
import typings.mobservable.libInterfacesMod.ITransitionEvent
import typings.mobservable.libInterfacesMod.Lambda
import typings.mobservable.libSimpleeventemitterMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable", "extras")
@js.native
object extras extends js.Object {
  @js.native
  class SimpleEventEmitter () extends default
  
  def getDNode(thing: js.Any): js.Any = js.native
  def getDependencyTree(thing: js.Any): IDependencyTree = js.native
  def getDependencyTree(thing: js.Any, property: String): IDependencyTree = js.native
  def getObserverTree(thing: js.Any): IObserverTree = js.native
  def getObserverTree(thing: js.Any, property: String): IObserverTree = js.native
  def trackTransitions(): Lambda = js.native
  def trackTransitions(extensive: Boolean): Lambda = js.native
  def trackTransitions(extensive: Boolean, onReport: js.Function1[/* lines */ ITransitionEvent, Unit]): Lambda = js.native
  def withStrict(newStrict: Boolean, func: Lambda): Unit = js.native
  @js.native
  object SimpleEventEmitter extends TopLevel[Instantiable0[default]]
  
}

