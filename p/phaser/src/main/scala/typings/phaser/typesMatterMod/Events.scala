package typings.phaser.typesMatterMod

import typings.phaser.phaserStrings.afterAdd
import typings.phaser.phaserStrings.afterRemove
import typings.phaser.phaserStrings.afterRender
import typings.phaser.phaserStrings.afterTick
import typings.phaser.phaserStrings.afterUpdate
import typings.phaser.phaserStrings.beforeAdd
import typings.phaser.phaserStrings.beforeRemove
import typings.phaser.phaserStrings.beforeRender
import typings.phaser.phaserStrings.beforeTick
import typings.phaser.phaserStrings.beforeUpdate
import typings.phaser.phaserStrings.collisionActive
import typings.phaser.phaserStrings.collisionEnd
import typings.phaser.phaserStrings.collisionStart
import typings.phaser.phaserStrings.mousedown
import typings.phaser.phaserStrings.mousemove
import typings.phaser.phaserStrings.mouseup
import typings.phaser.phaserStrings.sleepEnd
import typings.phaser.phaserStrings.sleepStart
import typings.phaser.phaserStrings.tick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phaser/types/matter", "Events")
@js.native
class Events () extends js.Object

/* static members */
@JSImport("phaser/types/matter", "Events")
@js.native
object Events extends js.Object {
  /**
    * Removes the given event callback. If no callback, clears all callbacks in eventNames. If no eventNames, clears all events.
    *
    * @param obj
    * @param eventName
    * @param callback
    */
  def off(obj: js.Any, eventName: String, callback: js.Function1[/* e */ js.Any, Unit]): Unit = js.native
  def on(obj: js.Any, name: String, callback: js.Function1[/* e */ js.Any, Unit]): Unit = js.native
  /**
    * Fired when a call to `Composite.add` is made, after objects have been added.
    *
    * @event afterAdd
    * @param {} event An event object
    * @param {} event.object The object(s) that have been added (may be a single body, constraint, composite or a mixed array of these)
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_afterAdd(obj: Engine, name: afterAdd, callback: js.Function1[/* e */ IEventComposite[Composite], Unit]): Unit = js.native
  /**
    * Fired when a call to `Composite.remove` is made, after objects have been removed.
    *
    * @event afterRemove
    * @param {} event An event object
    * @param {} event.object The object(s) that have been removed (may be a single body, constraint, composite or a mixed array of these)
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_afterRemove(obj: Engine, name: afterRemove, callback: js.Function1[/* e */ IEventComposite[Composite], Unit]): Unit = js.native
  /**
    * Fired after rendering
    *
    * @event afterRender
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_afterRender(
    obj: Engine,
    name: afterRender,
    callback: js.Function1[/* e */ IEventTimestamped[Render | Runner], Unit]
  ): Unit = js.native
  /**
    * Fired at the end of a tick, after engine update and after rendering
    *
    * @event afterTick
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_afterTick(obj: Engine, name: afterTick, callback: js.Function1[/* e */ IEventTimestamped[Runner], Unit]): Unit = js.native
  /**
    * Fired after engine update and all collision events
    *
    * @event afterUpdate
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_afterUpdate(obj: Engine, name: afterUpdate, callback: js.Function1[/* e */ IEventTimestamped[Engine], Unit]): Unit = js.native
  /**
    * Fired when a call to `Composite.add` is made, before objects have been added.
    *
    * @event beforeAdd
    * @param {} event An event object
    * @param {} event.object The object(s) to be added (may be a single body, constraint, composite or a mixed array of these)
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_beforeAdd(obj: Engine, name: beforeAdd, callback: js.Function1[/* e */ IEventComposite[Composite], Unit]): Unit = js.native
  /**
    * Fired when a call to `Composite.remove` is made, before objects have been removed.
    *
    * @event beforeRemove
    * @param {} event An event object
    * @param {} event.object The object(s) to be removed (may be a single body, constraint, composite or a mixed array of these)
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_beforeRemove(obj: Engine, name: beforeRemove, callback: js.Function1[/* e */ IEventComposite[Composite], Unit]): Unit = js.native
  /**
    * Fired before rendering
    *
    * @event beforeRender
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_beforeRender(
    obj: Engine,
    name: beforeRender,
    callback: js.Function1[/* e */ IEventTimestamped[Render | Runner], Unit]
  ): Unit = js.native
  /**
    * Fired at the start of a tick, before any updates to the engine or timing
    *
    * @event beforeTick
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_beforeTick(obj: Engine, name: beforeTick, callback: js.Function1[/* e */ IEventTimestamped[Runner], Unit]): Unit = js.native
  /**
    * Fired just before an update
    *
    * @event beforeUpdate
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_beforeUpdate(obj: Engine, name: beforeUpdate, callback: js.Function1[/* e */ IEventTimestamped[Engine], Unit]): Unit = js.native
  /**
    * Fired after engine update, provides a list of all pairs that are colliding in the current tick (if any)
    *
    * @event collisionActive
    * @param {} event An event object
    * @param {} event.pairs List of affected pairs
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_collisionActive(obj: Engine, name: collisionActive, callback: js.Function1[/* e */ IEventCollision[Engine], Unit]): Unit = js.native
  /**
    * Fired after engine update, provides a list of all pairs that have ended collision in the current tick (if any)
    *
    * @event collisionEnd
    * @param {} event An event object
    * @param {} event.pairs List of affected pairs
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_collisionEnd(obj: Engine, name: collisionEnd, callback: js.Function1[/* e */ IEventCollision[Engine], Unit]): Unit = js.native
  /**
    * Fired after engine update, provides a list of all pairs that have started to collide in the current tick (if any)
    *
    * @event collisionStart
    * @param {} event An event object
    * @param {} event.pairs List of affected pairs
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_collisionStart(obj: Engine, name: collisionStart, callback: js.Function1[/* e */ IEventCollision[Engine], Unit]): Unit = js.native
  /**
    * Fired when the mouse is down (or a touch has started) during the last step
    * @param obj
    * @param name
    * @param callback
    */
  @JSName("on")
  def on_mousedown(obj: MouseConstraint, name: mousedown, callback: js.Function1[/* e */ js.Any, Unit]): Unit = js.native
  /**
    * Fired when the mouse has moved (or a touch moves) during the last step
    * @param obj
    * @param name
    * @param callback
    */
  @JSName("on")
  def on_mousemove(obj: MouseConstraint, name: mousemove, callback: js.Function1[/* e */ js.Any, Unit]): Unit = js.native
  /**
    * Fired when the mouse is up (or a touch has ended) during the last step
    * @param obj
    * @param name
    * @param callback
    */
  @JSName("on")
  def on_mouseup(obj: MouseConstraint, name: mouseup, callback: js.Function1[/* e */ js.Any, Unit]): Unit = js.native
  /**
    * Fired when a body ends sleeping (where `this` is the body).
    *
    * @event sleepEnd
    * @this {body} The body that has ended sleeping
    * @param {} event An event object
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_sleepEnd(obj: Body, name: sleepEnd, callback: js.Function1[/* e */ IEvent[Body], Unit]): Unit = js.native
  /**
    * Fired when a body starts sleeping (where `this` is the body).
    *
    * @event sleepStart
    * @this {body} The body that has started sleeping
    * @param {} event An event object
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_sleepStart(obj: Body, name: sleepStart, callback: js.Function1[/* e */ IEvent[Body], Unit]): Unit = js.native
  /**
    * Fired after engine timing updated, but just before update
    *
    * @event tick
    * @param {} event An event object
    * @param {number} event.timestamp The engine.timing.timestamp of the event
    * @param {} event.source The source object of the event
    * @param {} event.name The name of the event
    */
  @JSName("on")
  def on_tick(obj: Engine, name: tick, callback: js.Function1[/* e */ IEventTimestamped[Runner], Unit]): Unit = js.native
  /**
    * Fires all the callbacks subscribed to the given object's eventName, in the order they subscribed, if any.
    *
    * @param object
    * @param eventNames
    * @param event
    */
  def trigger(`object`: js.Any, eventNames: String): Unit = js.native
  def trigger(`object`: js.Any, eventNames: String, event: js.Function1[/* e */ js.Any, Unit]): Unit = js.native
}

