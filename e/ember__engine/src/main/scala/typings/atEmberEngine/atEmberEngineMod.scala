package typings.atEmberEngine

import typings.atEmberEngine.dashPrivateTypesInitializerMod.Initializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/engine", JSImport.Namespace)
@js.native
object atEmberEngineMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: parser.TsParser#tsDeclClass functionCall class extends from : EmberObject.extend(RegistryProxyMixin) * / any */ @js.native
  trait Engine extends js.Object {
    /**
      * Set this to provide an alternate class to `Ember.DefaultResolver`
      */
    var resolver: typings.atEmberEngine.dashPrivateResolverMod.default = js.native
    /**
      * Create an EngineInstance for this Engine.
      */
    def buildInstance(): typings.atEmberEngine.instanceMod.default = js.native
    def buildInstance(options: js.Object): typings.atEmberEngine.instanceMod.default = js.native
  }
  
  @js.native
  class default () extends Engine
  
  def getEngineParent(engine: typings.atEmberEngine.instanceMod.default): typings.atEmberEngine.instanceMod.default = js.native
  /* static members */
  @js.native
  object default extends js.Object {
    /**
      * The goal of initializers should be to register dependencies and injections.
      * This phase runs once. Because these initializers may load code, they are
      * allowed to defer application readiness and advance it. If you need to access
      * the container or store you should use an InstanceInitializer that will be run
      * after all initializers and therefore after all code is loaded and the app is
      * ready.
      */
    def initializer(initializer: Initializer[Engine]): Unit = js.native
    /**
      * Instance initializers run after all initializers have run. Because
      * instance initializers run after the app is fully set up. We have access
      * to the store, container, and other items. However, these initializers run
      * after code has loaded and are not allowed to defer readiness.
      */
    def instanceInitializer(instanceInitializer: Initializer[typings.atEmberEngine.instanceMod.default]): Unit = js.native
  }
  
}

