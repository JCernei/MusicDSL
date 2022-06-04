class ArgumentParser():
    @staticmethod
    def extract_int(naturalValue):  
        naturalValue = [i.symbol.text for i in naturalValue.children]
        naturalValue = int(''.join(naturalValue))
        return naturalValue
    
    
    @staticmethod
    def extract_value(naturalValue):
        naturalValue = [i.symbol.text for i in naturalValue.children]
        naturalValue = (''.join(naturalValue))
        return naturalValue
    

    @staticmethod
    def extract_list(listChildren):
        to_parse = listChildren
        values = []
        while len(to_parse) > 0:
            if len(to_parse) == 1:
                values.append(ArgumentParser.extract_int(to_parse[0]))
                break
            values.append(ArgumentParser.extract_int(to_parse[0]))
            to_parse = to_parse[2].children

        return values
    

    @staticmethod
    def extract_float(listChildren):
        to_parse = listChildren
        if len(to_parse) == 1:
            float_value = ArgumentParser.extract_int(to_parse[0])
        elif len(to_parse) == 2:
            float_value_1 = str((ArgumentParser.extract_int(to_parse[0])))
            float_value_2 = str((ArgumentParser.extract_value(to_parse[1])))
            float_value = float(float_value_1 + '.' + float_value_2)
        return float_value