package typings.microsoftDashAjax.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Interfaces
/**
  * Provides a common interface for all components that can contain other components.
  */
trait IContainer extends js.Object {
  //#region Methods
  /**
    * Adds a Component object to the current container.
    * Implement this method for an object that will contain one or more component objects in order to programmatically add components to that container.
    * @param component
    *           The Component object to add.
    */
  def addComponent(component: Component): Unit
  /**
    * Returns the specified Component instance.
    * Implement this method for an object that will contain one or more component objects to access components within that container.
    * @param id
    *           The ID of the Component object to search for.
    * @return The Component instance with the specified ID.
    */
  def findComponent(id: String): Component
  /**
    * Returns an array of all objects in the current container that inherit from Component.
    * Implement this method for an object that will contain one or more component objects so that the components in that container are available. Types that implement this method should return a copy of the list of components so that modifying the array does not change the contents of the container.
    * @return An array of all objects in the current container that inherit from Component.
    */
  def getComponents(): js.Array[Component]
  /**
    * Removes a Component object from the current container.
    * @param component
    *               The Component object to remove.
    */
  def removeComponent(component: Component): Unit
}

object IContainer {
  @scala.inline
  def apply(
    addComponent: Component => Unit,
    findComponent: String => Component,
    getComponents: () => js.Array[Component],
    removeComponent: Component => Unit
  ): IContainer = {
    val __obj = js.Dynamic.literal(addComponent = js.Any.fromFunction1(addComponent), findComponent = js.Any.fromFunction1(findComponent), getComponents = js.Any.fromFunction0(getComponents), removeComponent = js.Any.fromFunction1(removeComponent))
  
    __obj.asInstanceOf[IContainer]
  }
}

