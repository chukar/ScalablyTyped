package typings.reactDashDates.reactDashDatesMod

import org.scalablytyped.runtime.TopLevel
import typings.moment.momentMod.MomentFormatSpecification
import typings.moment.momentMod.MomentInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// utils/toISODateString.js
@JSImport("react-dates", "toISODateString")
@js.native
object toISODateString
  extends TopLevel[
      js.Function2[/* date */ MomentInput, /* currentFormat */ MomentFormatSpecification, String | Null]
    ]

