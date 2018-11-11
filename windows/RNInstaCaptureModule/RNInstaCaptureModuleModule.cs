using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Insta.Capture.Module.RNInstaCaptureModule
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNInstaCaptureModuleModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNInstaCaptureModuleModule"/>.
        /// </summary>
        internal RNInstaCaptureModuleModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNInstaCaptureModule";
            }
        }
    }
}
