import { NativeModules } from 'react-native';

const { OpenApplication } = NativeModules;

const openApplication = (packageName:string) : Promise<any> =>{
    return OpenApplication.openApplication(packageName)
}
export default {
    openApplication
};
