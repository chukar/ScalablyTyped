package typings.atAngularCore.srcR3UnderscoreSymbolsMod

import typings.atAngularCore.Anon_PropName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base class for a factory that can create a component dynamically.
  * Instantiate a factory for a given type of component with `resolveComponentFactory()`.
  * Use the resulting `ComponentFactory.create()` method to create a component of that type.
  *
  * @see [Dynamic Components](guide/dynamic-component-loader)
  *
  * @publicApi
  */
@js.native
trait ComponentFactory[C] extends js.Object {
  /**
    * The type of component the factory will create.
    */
  val componentType: Type[_] = js.native
  /**
    * The inputs of the component.
    */
  val inputs: js.Array[Anon_PropName] = js.native
  /**
    * Selector for all <ng-content> elements in the component.
    */
  val ngContentSelectors: js.Array[String] = js.native
  /**
    * The outputs of the component.
    */
  val outputs: js.Array[Anon_PropName] = js.native
  /**
    * The component's HTML selector.
    */
  val selector: String = js.native
  /**
    * Creates a new component.
    */
  def create(injector: Injector): ComponentRef[C] = js.native
  def create(injector: Injector, projectableNodes: js.Array[js.Array[_]]): ComponentRef[C] = js.native
  def create(injector: Injector, projectableNodes: js.Array[js.Array[_]], rootSelectorOrNode: String): ComponentRef[C] = js.native
  def create(
    injector: Injector,
    projectableNodes: js.Array[js.Array[_]],
    rootSelectorOrNode: String,
    ngModule: NgModuleRef[_]
  ): ComponentRef[C] = js.native
  def create(injector: Injector, projectableNodes: js.Array[js.Array[_]], rootSelectorOrNode: js.Any): ComponentRef[C] = js.native
  def create(
    injector: Injector,
    projectableNodes: js.Array[js.Array[_]],
    rootSelectorOrNode: js.Any,
    ngModule: NgModuleRef[_]
  ): ComponentRef[C] = js.native
}

