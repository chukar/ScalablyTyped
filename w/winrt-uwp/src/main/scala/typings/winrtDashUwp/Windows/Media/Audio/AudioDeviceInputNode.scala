package typings.winrtDashUwp.Windows.Media.Audio

import typings.winrtDashUwp.Windows.Devices.Enumeration.DeviceInformation
import typings.winrtDashUwp.Windows.Foundation.Collections.IVector
import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Media.Effects.IAudioEffectDefinition
import typings.winrtDashUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an audio device input node. */
@JSGlobal("Windows.Media.Audio.AudioDeviceInputNode")
@js.native
abstract class AudioDeviceInputNode () extends js.Object {
  /** Gets or sets a value indicating if the audio device input node consumes input. */
  var consumeInput: Boolean = js.native
  /** Gets information about the audio device. */
  var device: DeviceInformation = js.native
  /** Gets the list of effect definitions for the audio device input node. */
  var effectDefinitions: IVector[IAudioEffectDefinition] = js.native
  /** Gets the encoding properties for the audio device input node. */
  var encodingProperties: AudioEncodingProperties = js.native
  /** Gets the list of outgoing connections from the audio device input node to other nodes in the audio graph. */
  var outgoingConnections: IVectorView[AudioGraphConnection] = js.native
  /** Gets or sets the outgoing gain for the audio device input node. */
  var outgoingGain: Double = js.native
  /**
    * Adds an outgoing connection to the audio device input node.
    * @param destination The destination node for the connection.
    */
  def addOutgoingConnection(destination: IAudioNode): Unit = js.native
  /**
    * Adds an outgoing connection with gain to the audio device input node.
    * @param destination The destination node for the connection.
    * @param gain A value indicating the gain associated with the connection.
    */
  def addOutgoingConnection(destination: IAudioNode, gain: Double): Unit = js.native
  /** Closes the audio device input node. */
  def close(): Unit = js.native
  /**
    * Disables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to disable.
    */
  def disableEffectsByDefinition(definition: IAudioEffectDefinition): Unit = js.native
  /**
    * Enables all effects in the EffectDefinitions list with the specified effect definition.
    * @param definition The effect definition of the effects to enable.
    */
  def enableEffectsByDefinition(definition: IAudioEffectDefinition): Unit = js.native
  /**
    * Removes the outgoing connection for the audio device input node.
    * @param destination The destination for the outgoing connection.
    */
  def removeOutgoingConnection(destination: IAudioNode): Unit = js.native
  /** Resets the audio device input node. */
  def reset(): Unit = js.native
  /** Starts the audio device input node. */
  def start(): Unit = js.native
  /** Stops the audio device input node. */
  def stop(): Unit = js.native
}

