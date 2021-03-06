package typings.meshblu.Meshblu

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  def authenticate(data: js.Any, fn: js.Function1[/* result */ js.Any, Unit]): Connection
  def bufferedSocketEmit(): Unit
  def claimdevice(data: Device, fn: js.Function1[/* result */ Device, Unit]): Connection
  def close(fn: js.Function1[/* result */ js.Any, Unit]): Connection
  def connect(): Unit
  /**
  		 * Send a meshblu data message.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 * @returns This Connection.
  		 */
  def data(data: DataInput, fn: js.Function1[/* result */ js.Any, Unit]): Connection
  /**
  		 * Find a Meshblu device.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 * @returns This Connection.
  		 */
  def device(data: Device, fn: js.Function1[/* result */ DeviceResponse, Unit]): Connection
  /**
  		 * Find Meshblu devices.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 * @returns This Connection.
  		 */
  def devices(data: Color, fn: js.Function1[/* result */ js.Array[DeviceResponse], Unit]): Connection
  def directText(data: js.Any): Connection
  /**
  		 * @param uuid
  		 * @param message {string|number|object|array|Buffer} - data for encrypting.
  		 * @param options
  		 * @param fn The callback to be called. It should take one parameter, result,
  		 * 	which is an object containing a property "error".
  		 * @returns This Connection.
  		 */
  def encryptMessage(
    uuid: String,
    message: js.Any,
    options: ConnectionOptions,
    fn: js.Function1[/* result */ js.Any, Unit]
  ): Connection
  def events(data: js.Any, fn: js.Function1[/* result */ js.Any, Unit]): Connection
  /**
  		 * Generate a new session token for a device.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 */
  def generateAndStoreToken(data: Device, fn: js.Function1[/* result */ ConnectionOptions, Unit]): Unit
  def generateKeyPair(): KeyPair
  /**
  		 *
  		 * @param uuid
  		 * @param fn The callback to be called. It should take one parameter, err,
  		 * 	which will be null if there was no problem, and one parameter, publicKey,
  		 * 	of type NodeRSA.
  		 */
  def getPublicKey(uuid: String, fn: js.Function2[/* err */ Error, /* publicKey */ js.Any, Unit]): Unit
  /**
  		 * Get a meshblu data for a device.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 * @returns This Connection.
  		 */
  def getdata(data: GetDataInput, fn: js.Function1[/* result */ js.Any, Unit]): Connection
  /**
  		 * Authenticate with Meshblu.
  		 * @returns This Connection.
  		 */
  def identify(): Connection
  def localdevices(fn: js.Function1[/* result */ js.Any, Unit]): Connection
  /**
  		 * Send a meshblu message.
  		 * @param payload An array of devices UUIDs.
  		 * @param fn The callback to be called. It should take one parameter, result,
  		 * 	which is an object containing a property "error".
  		 * @returns This Connection.
  		 */
  def message(payload: MessagePayload, fn: js.Function1[/* result */ js.Any, Unit]): Connection
  def mydevices(data: js.Any, fn: js.Function1[/* result */ js.Any, Unit]): Connection
  def parseUrl(serverUrl: String, port: String): String
  def reconnect(): Unit
  /**
  		 * Register a new device record.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 * @returns This Connection.
  		 */
  def register(data: RegisterData, fn: js.Function1[/* result */ RegisterResponse, Unit]): Connection
  def resetToken(data: js.Any, fn: js.Function1[/* result */ js.Any, Unit]): Unit
  /**
  		 * Remove a session token from a device.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 */
  def revokeToken(data: ConnectionOptions, fn: js.Function1[/* result */ Device, Unit]): Unit
  /*
  		 * Lack of documentation about these api functions.
  		 */
  def send(text: String): Connection
  def setPrivateKey(privateKey: String): Unit
  def setup(): Connection
  /**
  		 * @param data {string|number|object|array|Buffer} - data for signing.
  		 */
  def sign(data: js.Any): String
  def status(data: js.Any): Connection
  /**
  		 * Returns device messages as they are sent and received.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 * @returns This Connection.
  		 */
  def subscribe(data: SubscribeData, fn: js.Function1[/* result */ js.Any, Unit]): Connection
  def subscribeText(data: js.Any, fn: js.Function1[/* result */ js.Any, Unit]): Connection
  def textBroadcast(data: js.Any): Connection
  def unclaimeddevices(data: js.Any, fn: js.Function1[/* result */ js.Any, Unit]): Connection
  /**
  		 * Removes a device record.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 * @returns This Connection.
  		 */
  def unregister(data: Device, fn: js.Function1[/* result */ Device, Unit]): Connection
  /**
  		 * Cancels device subscription.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 * @returns This Connection.
  		 */
  def unsubscribe(data: UnsubscribeData, fn: js.Function1[/* result */ js.Any, Unit]): Connection
  def unsubscribeText(data: js.Any, fn: js.Function1[/* result */ js.Any, Unit]): Connection
  /**
  		 * Update a device record.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 * @returns This Connection.
  		 */
  def update(data: UpdateData, fn: js.Function1[/* result */ UpdateSuccess, Unit]): Connection
  /**
  		 * @param message {string|number|object|array|Buffer} - signed data.
  		 * @param signature
  		 * @returns {*}
  		 */
  def verify(message: js.Any, signature: js.Any): js.Any
  /**
  		 * Get my device info.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 * @returns This Connection.
  		 */
  def whoami(data: js.Any, fn: js.Function1[/* result */ DeviceResponse, Unit]): Connection
}

object Connection {
  @scala.inline
  def apply(
    authenticate: (js.Any, js.Function1[/* result */ js.Any, Unit]) => Connection,
    bufferedSocketEmit: () => Unit,
    claimdevice: (Device, js.Function1[/* result */ Device, Unit]) => Connection,
    close: js.Function1[/* result */ js.Any, Unit] => Connection,
    connect: () => Unit,
    data: (DataInput, js.Function1[/* result */ js.Any, Unit]) => Connection,
    device: (Device, js.Function1[/* result */ DeviceResponse, Unit]) => Connection,
    devices: (Color, js.Function1[/* result */ js.Array[DeviceResponse], Unit]) => Connection,
    directText: js.Any => Connection,
    encryptMessage: (String, js.Any, ConnectionOptions, js.Function1[/* result */ js.Any, Unit]) => Connection,
    events: (js.Any, js.Function1[/* result */ js.Any, Unit]) => Connection,
    generateAndStoreToken: (Device, js.Function1[/* result */ ConnectionOptions, Unit]) => Unit,
    generateKeyPair: () => KeyPair,
    getPublicKey: (String, js.Function2[/* err */ Error, /* publicKey */ js.Any, Unit]) => Unit,
    getdata: (GetDataInput, js.Function1[/* result */ js.Any, Unit]) => Connection,
    identify: () => Connection,
    localdevices: js.Function1[/* result */ js.Any, Unit] => Connection,
    message: (MessagePayload, js.Function1[/* result */ js.Any, Unit]) => Connection,
    mydevices: (js.Any, js.Function1[/* result */ js.Any, Unit]) => Connection,
    parseUrl: (String, String) => String,
    reconnect: () => Unit,
    register: (RegisterData, js.Function1[/* result */ RegisterResponse, Unit]) => Connection,
    resetToken: (js.Any, js.Function1[/* result */ js.Any, Unit]) => Unit,
    revokeToken: (ConnectionOptions, js.Function1[/* result */ Device, Unit]) => Unit,
    send: String => Connection,
    setPrivateKey: String => Unit,
    setup: () => Connection,
    sign: js.Any => String,
    status: js.Any => Connection,
    subscribe: (SubscribeData, js.Function1[/* result */ js.Any, Unit]) => Connection,
    subscribeText: (js.Any, js.Function1[/* result */ js.Any, Unit]) => Connection,
    textBroadcast: js.Any => Connection,
    unclaimeddevices: (js.Any, js.Function1[/* result */ js.Any, Unit]) => Connection,
    unregister: (Device, js.Function1[/* result */ Device, Unit]) => Connection,
    unsubscribe: (UnsubscribeData, js.Function1[/* result */ js.Any, Unit]) => Connection,
    unsubscribeText: (js.Any, js.Function1[/* result */ js.Any, Unit]) => Connection,
    update: (UpdateData, js.Function1[/* result */ UpdateSuccess, Unit]) => Connection,
    verify: (js.Any, js.Any) => js.Any,
    whoami: (js.Any, js.Function1[/* result */ DeviceResponse, Unit]) => Connection
  ): Connection = {
    val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction2(authenticate), bufferedSocketEmit = js.Any.fromFunction0(bufferedSocketEmit), claimdevice = js.Any.fromFunction2(claimdevice), close = js.Any.fromFunction1(close), connect = js.Any.fromFunction0(connect), data = js.Any.fromFunction2(data), device = js.Any.fromFunction2(device), devices = js.Any.fromFunction2(devices), directText = js.Any.fromFunction1(directText), encryptMessage = js.Any.fromFunction4(encryptMessage), events = js.Any.fromFunction2(events), generateAndStoreToken = js.Any.fromFunction2(generateAndStoreToken), generateKeyPair = js.Any.fromFunction0(generateKeyPair), getPublicKey = js.Any.fromFunction2(getPublicKey), getdata = js.Any.fromFunction2(getdata), identify = js.Any.fromFunction0(identify), localdevices = js.Any.fromFunction1(localdevices), message = js.Any.fromFunction2(message), mydevices = js.Any.fromFunction2(mydevices), parseUrl = js.Any.fromFunction2(parseUrl), reconnect = js.Any.fromFunction0(reconnect), register = js.Any.fromFunction2(register), resetToken = js.Any.fromFunction2(resetToken), revokeToken = js.Any.fromFunction2(revokeToken), send = js.Any.fromFunction1(send), setPrivateKey = js.Any.fromFunction1(setPrivateKey), setup = js.Any.fromFunction0(setup), sign = js.Any.fromFunction1(sign), status = js.Any.fromFunction1(status), subscribe = js.Any.fromFunction2(subscribe), subscribeText = js.Any.fromFunction2(subscribeText), textBroadcast = js.Any.fromFunction1(textBroadcast), unclaimeddevices = js.Any.fromFunction2(unclaimeddevices), unregister = js.Any.fromFunction2(unregister), unsubscribe = js.Any.fromFunction2(unsubscribe), unsubscribeText = js.Any.fromFunction2(unsubscribeText), update = js.Any.fromFunction2(update), verify = js.Any.fromFunction2(verify), whoami = js.Any.fromFunction2(whoami))
  
    __obj.asInstanceOf[Connection]
  }
}

