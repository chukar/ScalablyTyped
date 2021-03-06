package typings.pino

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pinoMod {
  import org.scalablytyped.runtime.StringDictionary

  type LevelChangeEventListener = js.Function4[
    /* lvl */ LevelWithSilent | String, 
    /* val */ Double, 
    /* prevLvl */ LevelWithSilent | String, 
    /* prevVal */ Double, 
    Unit
  ]
  type Logger = BaseLogger with StringDictionary[LogFn]
  type SerializedError = typings.pinoDashStdDashSerializers.pinoDashStdDashSerializersMod.SerializedError
  type SerializedRequest = typings.pinoDashStdDashSerializers.pinoDashStdDashSerializersMod.SerializedRequest
  type SerializedResponse = typings.pinoDashStdDashSerializers.pinoDashStdDashSerializersMod.SerializedResponse
  type SerializerFn = js.Function1[/* value */ js.Any, js.Any]
  type TimeFn = js.Function0[String]
  type WriteFn = js.Function1[/* o */ js.Object, Unit]
}
