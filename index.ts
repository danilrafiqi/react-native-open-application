
import { NativeModules } from 'react-native';

const { RNOpenApplication } = NativeModules;

const openApplication = (packageName:string) : Promise<any> =>{
    return RNOpenApplication.openApplication(packageName)
}
export default {
    openApplication
};
