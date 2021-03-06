package typings.rotDashJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import typings.rotDashJs.libMapCellularMod.Options
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/map", JSImport.Namespace)
@js.native
object libMapMod extends js.Object {
  @js.native
  object default extends js.Object {
    @js.native
    class Arena ()
      extends typings.rotDashJs.libMapArenaMod.default
    
    @js.native
    class Cellular protected ()
      extends typings.rotDashJs.libMapCellularMod.default {
      def this(width: Double, height: Double) = this()
      def this(width: Double, height: Double, options: Partial[Options]) = this()
    }
    
    @js.native
    class Digger protected ()
      extends typings.rotDashJs.libMapDiggerMod.default {
      def this(width: Double, height: Double) = this()
      def this(width: Double, height: Double, options: Partial[typings.rotDashJs.libMapDiggerMod.Options]) = this()
    }
    
    @js.native
    class DividedMaze ()
      extends typings.rotDashJs.libMapDividedmazeMod.default
    
    @js.native
    class EllerMaze ()
      extends typings.rotDashJs.libMapEllermazeMod.default
    
    @js.native
    class IceyMaze protected ()
      extends typings.rotDashJs.libMapIceymazeMod.default {
      def this(width: Double, height: Double) = this()
      def this(width: Double, height: Double, regularity: Double) = this()
    }
    
    @js.native
    class Rogue protected ()
      extends typings.rotDashJs.libMapRogueMod.default {
      def this(width: Double, height: Double, options: Partial[typings.rotDashJs.libMapRogueMod.Options]) = this()
    }
    
    @js.native
    class Uniform protected ()
      extends typings.rotDashJs.libMapUniformMod.default {
      def this(width: Double, height: Double, options: Partial[typings.rotDashJs.libMapUniformMod.Options]) = this()
    }
    
    @js.native
    object Arena
      extends TopLevel[Instantiable0[typings.rotDashJs.libMapArenaMod.default]]
    
    @js.native
    object Cellular
      extends TopLevel[
              Instantiable3[
                /* width */ Double, 
                /* height */ Double, 
                js.UndefOr[/* options */ Partial[Options]], 
                typings.rotDashJs.libMapCellularMod.default
              ]
            ]
    
    @js.native
    object Digger
      extends TopLevel[
              Instantiable3[
                /* width */ Double, 
                /* height */ Double, 
                js.UndefOr[/* options */ Partial[typings.rotDashJs.libMapDiggerMod.Options]], 
                typings.rotDashJs.libMapDiggerMod.default
              ]
            ]
    
    @js.native
    object DividedMaze
      extends TopLevel[Instantiable0[typings.rotDashJs.libMapDividedmazeMod.default]]
    
    @js.native
    object EllerMaze
      extends TopLevel[Instantiable0[typings.rotDashJs.libMapEllermazeMod.default]]
    
    @js.native
    object IceyMaze
      extends TopLevel[
              Instantiable3[
                /* width */ Double, 
                /* height */ Double, 
                js.UndefOr[/* regularity */ Double], 
                typings.rotDashJs.libMapIceymazeMod.default
              ]
            ]
    
    @js.native
    object Rogue
      extends TopLevel[
              Instantiable3[
                /* width */ Double, 
                /* height */ Double, 
                /* options */ Partial[typings.rotDashJs.libMapRogueMod.Options], 
                typings.rotDashJs.libMapRogueMod.default
              ]
            ]
    
    @js.native
    object Uniform
      extends TopLevel[
              Instantiable3[
                /* width */ Double, 
                /* height */ Double, 
                /* options */ Partial[typings.rotDashJs.libMapUniformMod.Options], 
                typings.rotDashJs.libMapUniformMod.default
              ]
            ]
    
  }
  
}

